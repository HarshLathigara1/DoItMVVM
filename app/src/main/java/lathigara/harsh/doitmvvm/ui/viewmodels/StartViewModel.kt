package lathigara.harsh.doitmvvm.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import lathigara.harsh.doitmvvm.R
import lathigara.harsh.doitmvvm.ui.interfaces.StartInterface
import lathigara.harsh.doitmvvm.ui.viewmodels.StartFragment.Companion.nav_controller

class StartViewModel : ViewModel(){




    // var authListenr:StartInterface? =null

    fun login_button_click(){

       // authListenr!!.movedToLogin()
        nav_controller!!.navigate(R.id.action_startFragment_to_loginFragment)

    }

    fun forget_password_button_click(){


    }

    fun signin_button_click(){
        nav_controller!!.navigate(R.id.action_startFragment_to_registerFragment)

    }

}