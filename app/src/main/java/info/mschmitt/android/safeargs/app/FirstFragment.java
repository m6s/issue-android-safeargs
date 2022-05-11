package info.mschmitt.android.safeargs.app;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import info.mschmitt.android.safeargs.app.databinding.FragmentFirstBinding;

/**
 * @author Matthias Schmitt
 */
public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    public FirstFragment() {
        super(R.layout.fragment_first);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding = FragmentFirstBinding.bind(view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
