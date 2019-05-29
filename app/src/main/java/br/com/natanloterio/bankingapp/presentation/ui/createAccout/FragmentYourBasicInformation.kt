package br.com.natanloterio.bankingapp.presentation.ui.createAccout

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import br.com.natanloterio.bankingapp.R
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.EYourBasicInformationFields.*
import br.com.natanloterio.bankingapp.presentation.ui.welcome.FragmentYourBasicInformationContract
import kotlinx.android.synthetic.main.fragment_your_basic_information.*

class FragmentYourBasicInformation: Fragment(),FragmentYourBasicInformationContract.View{

    companion object{
        const val FORM_IS_DONE = "FORM_IS_DONE"
    }

    lateinit var presenter: FragmentYourBasicInformationContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_your_basic_information, container, false)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = PresenterYourBasicInformation(this)
        presenter.init()
    }

    override fun setupViewListeners() {
        edtYourPhone.setOnEditorActionListener() { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_GO) {
                presenter.onClickDoneField()
                true
            }
            false
        }
    }

    private fun notifyStakeHoldersFormIsReady() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateView(viewModel: YourBasicInformationViewModel) {

        when(viewModel.fieldInFocus){

            NAME ->  edtYourName.requestFocus()

            BIRTHDAY ->  edtYourBirthday.requestFocus()

            PHONE ->  edtYourPhone.requestFocus()
        }
    }

    override fun nofityStakeHolders() {
        var intent = Intent(FORM_IS_DONE)
        activity!!.sendBroadcast(intent)
    }



}