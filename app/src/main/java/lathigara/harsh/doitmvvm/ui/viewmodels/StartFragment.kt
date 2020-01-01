package lathigara.harsh.doitmvvm.ui.viewmodels

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import lathigara.harsh.doitmvvm.R
import lathigara.harsh.doitmvvm.databinding.StartActivityBinding

class StartFragment :Fragment() {
    companion object{
        var nav_controller:NavController? = null

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)
        val binding = DataBindingUtil.inflate<StartActivityBinding>(inflater,R.layout.start_activity, container, false).apply {
            this.setLifecycleOwner(this@StartFragment)
            this.viewmodel = viewModel
        }

        return binding.root



    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav_controller = Navigation.findNavController(view)



    }


}