package com.example.fish.day8_bottomnavigationfragmentintent


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_fragment_1.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Fragment_0 : Fragment() {
    val intent = intent()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.wtf("aaaaa", "onCreatView")
        val view = inflater.inflate(R.layout.main_fragment_1, container, false)
        view!!.frag_button.setOnClickListener { intent.intent(this.context, Activity_2()) }
        return view
    }

    override fun onPause() {
        Log.wtf("aaaaaa", "pause")

        super.onPause()
    }

    override fun onStop() {
        Log.wtf("aaaaaa", "stop")

        super.onStop()
    }

    override fun onStart() {
        Log.wtf("aaaaaa", "start")

        super.onStart()

    }

    override fun onResume() {
        Log.wtf("aaaaaa", "Resume")

        super.onResume()
    }

}
