package lathigara.harsh.doitmvvm.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lathigara.harsh.doitmvvm.ui.interfaces.RegisterInteface
import lathigara.harsh.doitmvvm.ui.utils.toast

class RegisterActivity : AppCompatActivity(), RegisterInteface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun pleaseEnterValidUserNameOrPassword() {
        toast("plese Check Your userName or Password")
    }

    override fun errorWhileSigninUp() {
        toast("error While SigninUp ")
    }

    override fun RegisterComplete() {
        toast("SuccessFully Registered")
    }


}