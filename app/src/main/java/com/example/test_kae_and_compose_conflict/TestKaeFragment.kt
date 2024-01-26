package com.example.test_kae_and_compose_conflict

import android.app.Fragment
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.test_kae.test_kae_ll

/**
 * Created by xiaozihan.larryxiao on 2024/1/26
 * @author xiaozihan.larryxiao@bytedance.com
 */
class TestKaeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater?.inflate(R.layout.test_kae, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test_kae_ll.gravity = Gravity.NO_GRAVITY
    }
}