package lathigara.harsh.doitmvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import lathigara.harsh.doitmvvm.R
import lathigara.harsh.doitmvvm.databinding.StartActivityBinding
import lathigara.harsh.doitmvvm.ui.interfaces.StartInterface
import lathigara.harsh.doitmvvm.ui.utils.toast
import lathigara.harsh.doitmvvm.ui.viewmodels.StartViewModel

class StartActivity : AppCompatActivity() ,StartInterface{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /* val binding : StartActivityBinding = DataBindingUtil.setContentView(this, R.layout.start_activity)
        val viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.authListenr = this*/
    }


    override fun movedToLogin() {
        toast("You are Moved To Login")


    }

    override fun movedToSignUp() {

        toast("You are Moved To SignUp")
    }

}