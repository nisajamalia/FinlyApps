package com.dean.apihomemarketplace.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dean.apihomemarketplace.activity.KeamananActivity
import com.dean.apihomemarketplace.R
import com.dean.apihomemarketplace.activity.LoanActivity
import com.dean.apihomemarketplace.activity.MainActivity
import kotlinx.android.synthetic.main.activity_manage_budgeting.iv_backstage_manage
import kotlinx.android.synthetic.main.fragment_licencing.btn_capital
import kotlinx.android.synthetic.main.fragment_licencing.btn_security
import kotlinx.android.synthetic.main.fragment_licencing.iv_back_licencing

class LicencingFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
          //  showBackHome()

            

    }

//    private fun showBackHome() {
//        iv_backstage_finance.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_security.setOnClickListener {
            val intent = Intent(context, KeamananActivity::class.java)
            startActivity(intent)
        }
        btn_capital.setOnClickListener {
            val intent = Intent(context, LoanActivity::class.java)
            startActivity(intent)
        }

        iv_back_licencing.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_licencing, container, false)

//        btn_security.setOnClickListener {
//            val intent = Intent(context, KeamananActivity::class.java)
//            startActivity(intent)
//
//
//        }


    }



    companion object {

        fun newInstance(param1: String, param2: String) =
            LicencingFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}