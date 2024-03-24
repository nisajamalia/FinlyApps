package com.dean.apihomemarketplace.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.dean.apihomemarketplace.R
import com.dean.apihomemarketplace.activity.CommunityActivity
import com.dean.apihomemarketplace.activity.ConsultingActivity
import com.dean.apihomemarketplace.activity.DebtItemDataActivity
import com.dean.apihomemarketplace.activity.FinanceActivity
import com.dean.apihomemarketplace.activity.ManageBudgeting
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.*


class HomeFragment : Fragment() {


    companion object {
        fun defaultFragment(): HomeFragment {
            val home_fragment = HomeFragment()
            //ngirim ke oncreate
            val bundle = Bundle()
            //arguments default function u ngirim data
            home_fragment.arguments = bundle
            return home_fragment
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View? {
        var v: View = inflater.inflate(R.layout.fragment_home, container, false)

//        rvTerkini = v.findViewById(R.id.rv_terkini)
//        rv_popular = v.findViewById(R.id.rv_popular)
//        searchView = v.findViewById(R.id.searchView)
//        searchView.setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS)


//        displayList.addAll(ArrayList<DataItem>())
        return v


    }
//
//    val imageContentSlider = intArrayOf(
//            R.drawable.rumah1,
//            R.drawable.rumah2,
//            R.drawable.rumah3,
//            R.drawable.rumah4
//
//    )

//    val imageContentList: ImageListener = object : ImageListener {
//        override fun setImageForPosition(position: Int, imageView: ImageView?) {
//            imageView?.setImageResource(imageContentSlider[position])
//
//        }
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val carouselView = is_main as CarouselView
//        //set yang sudah ditempel
//        carouselView.setImageListener(imageContentList)
//        //membaca maximum index yang dibaca
//        carouselView.pageCount = imageContentSlider.count()


        btndebt.setOnClickListener {
            val intent = Intent(context, DebtItemDataActivity::class.java)
            startActivity(intent)
        }
        finance.setOnClickListener {
            val intent = Intent(context, FinanceActivity::class.java)
            startActivity(intent)
        }
        logocommunity.setOnClickListener {
            val intent = Intent(context, CommunityActivity::class.java)
            startActivity(intent)
        }
        budget.setOnClickListener {
            val intent = Intent(context, ManageBudgeting::class.java)
            startActivity(intent)
        }
        logo_consul.setOnClickListener {
            val intent = Intent(context, ConsultingActivity::class.java)
            startActivity(intent)
        }




        //tapi kalo yang ini itu pake searchview yang serach view juga
//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String) : Boolean {
//                if (displayList.contains(query)) {
//                    rvTerkini.filter(query)
//                } else {
//                    Toast.makeText(context, "No Match found", Toast.LENGTH_LONG).show()
//                }
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String) : Boolean{
//                terkiniAdapter!!.filter(newText)
//                return false
//            }
//        })




    }





    //ini pasangan yg pake searchview
//    private fun filterList(filterItem: String) {
//        var tempList: ArrayList<DataItem> = ArrayList()
//
//        for (d in itemList){
//
//            if (filterItem in d.name.toString()){
//
//                tempList.add(d)
//            }
//        }
//        terkiniAdapter!!.setData(tempList)
//    }

//    ========================================================================================

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//
//        val menuItem = menu.findItem(R.id.searchView)
//        if (menuItem !=  null){
//
//            val searchView = menuItem.actionView as SearchView
//            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
//                override fun onQueryTextSubmit(query: String?): Boolean {
//                    return true
//                }
//
//                override fun onQueryTextChange(newText: String?): Boolean {
//
//                    if (newText!!.isNotEmpty()){
//                        displayList.clear()
//                        val search = newText.toLowerCase(Locale.getDefault())
//                        ArrayList<DataItem>().forEach {
//
//                            if (it.name!!.toLowerCase(Locale.getDefault()).contains(search)){
//                                displayList.add(it)
//                            }
//                        }
//                        rvTerkini.adapter!!.notifyDataSetChanged()
//
//                    } else {
//                        displayList.clear()
//                        displayList.addAll(ArrayList<DataItem>())
//                        rvTerkini.adapter!!.notifyDataSetChanged()
//                    }
//                    return true
//                }
//
//            })
//
//        }
//
//        super.onCreateOptionsMenu(menu, inflater)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return super.onOptionsItemSelected(item)
//    }



}


