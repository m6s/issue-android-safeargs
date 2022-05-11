package info.mschmitt.android.safeargs.app;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import info.mschmitt.android.safeargs.app.databinding.FragmentSecondBinding;

/**
 * @author Matthias Schmitt
 */
public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;

    public SecondFragment() {
        super(R.layout.fragment_second);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding = FragmentSecondBinding.bind(view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
