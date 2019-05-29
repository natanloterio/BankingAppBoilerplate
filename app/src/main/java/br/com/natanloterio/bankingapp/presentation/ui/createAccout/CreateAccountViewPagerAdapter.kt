package br.com.natanloterio.bankingapp.presentation.ui.createAccout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CreateAccountViewPagerAdapter(fm: FragmentManager?): FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return FragmentPresentation()
            1 -> return FragmentWhatYouWillHave()
            2 -> return FragmentOrientationsBeforeWeGo()
            3 -> return FragmentJustAFriendlyNote()
            4 -> return FragmentYourBasicInformation()
            else -> return FragmentPresentation()
        }

    }

    override fun getCount(): Int {
        return 5
    }
}