package dev.pegasus.livedata.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dev.pegasus.livedata.R
import dev.pegasus.livedata.databinding.FragmentHomeBinding
import dev.pegasus.livedata.helper.view_models.HomeViewModel

class FragmentHome : BaseFragment<FragmentHomeBinding>() {

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return getView(layoutInflater, container, R.layout.fragment_home)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()

        binding.btnFetchHome.setOnClickListener { viewModel.fetchList() }
    }

    private fun initViewModel() {
        viewModel.nameListLiveData.observe(viewLifecycleOwner) {
            binding.tvResultHome.text = it.toString()
        }
    }
}