package br.com.natanloterio.bankingapp.presentation.ui.createAccout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.natanloterio.bankingapp.R
import kotlinx.android.synthetic.main.fragment_presentation.*

class FragmentOrientationsBeforeWeGo: Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_orientations_before_we_go, container, false)!!

    }

    override fun onResume() {
        super.onResume()

    }

}