package com.lxio.lxio.sevensegmentdigitaltubecode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeTextView()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.popupmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.getItemId()) {
            R.id.cathode -> {
                isCathode = true
            }
            R.id.anode -> {
                isCathode = false
            }
        }
        changeTextView()
        return true
    }


    companion object {
        val dop: Int = 0
        val sA: Int = 7
        val sB: Int = 6
        val sC: Int = 5
        val sD: Int = 4
        val sE: Int = 3
        val sF: Int = 2
        val sG: Int = 1

        var bitArray: IntArray = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0)
        var isCathode: Boolean = true
    }

    private fun bitToInt(bit: IntArray): Int {
        var rst: Int = 0
        for (i in bit) {
            rst = rst * 2 + i
        }
        return rst
    }

    private fun changeTextView() {
        var bits:IntArray = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0 )
        if (isCathode){
            bits = bitArray
        }else{
            for (i in 0..7){
                bits[i] = bitArray[i].xor(1)
            }
        }
        binTextView.text = "BIN: " + java.lang.Integer.toBinaryString(bitToInt(bits)).padStart(8, '0')
        octTextView.text = "OCT: " + java.lang.Integer.toOctalString(bitToInt(bits))
        decTextView.text = "DEC: " + bitToInt(bits)
        hexTextView.text = "HEX: 0x" + java.lang.Integer.toHexString(bitToInt(bits))

    }



    fun segDopClick(view: View) {
        when (bitArray[dop]) {
            0 -> {
                segDop.setImageResource(R.drawable.ic_doton)
                bitArray[dop] = 1
            }
            1 -> {
                segDop.setImageResource(R.drawable.ic_dotoff)
                bitArray[dop] = 0
            }
        }
        changeTextView()
    }

    fun segAClick(view: View) {
        when (bitArray[sA]) {
            0 -> {
                segA.setImageResource(R.drawable.ic_segonh)
                bitArray[sA] = 1
            }
            1 -> {
                segA.setImageResource(R.drawable.ic_segoffh)
                bitArray[sA] = 0
            }
        }
        changeTextView()
    }

    fun segBClick(view: View) {
        when (bitArray[sB]) {
            0 -> {
                segB.setImageResource(R.drawable.ic_segonv)
                bitArray[sB] = 1
            }
            1 -> {
                segB.setImageResource(R.drawable.ic_segoffv)
                bitArray[sB] = 0
            }
        }
        changeTextView()
    }

    fun segCClick(view: View) {
        when (bitArray[sC]) {
            0 -> {
                segC.setImageResource(R.drawable.ic_segonv)
                bitArray[sC] = 1
            }
            1 -> {
                segC.setImageResource(R.drawable.ic_segoffv)
                bitArray[sC] = 0
            }
        }
        changeTextView()
    }

    fun segDClick(view: View) {
        when (bitArray[sD]) {
            0 -> {
                segD.setImageResource(R.drawable.ic_segonh)
                bitArray[sD] = 1
            }
            1 -> {
                segD.setImageResource(R.drawable.ic_segoffh)
                bitArray[sD] = 0
            }
        }
        changeTextView()
    }

    fun segEClick(view: View) {
        when (bitArray[sE]) {
            0 -> {
                segE.setImageResource(R.drawable.ic_segonv)
                bitArray[sE] = 1
            }
            1 -> {
                segE.setImageResource(R.drawable.ic_segoffv)
                bitArray[sE] = 0
            }
        }
        changeTextView()
    }

    fun segFClick(view: View) {
        when (bitArray[sF]) {
            0 -> {
                segF.setImageResource(R.drawable.ic_segonv)
                bitArray[sF] = 1
            }
            1 -> {
                segF.setImageResource(R.drawable.ic_segoffv)
                bitArray[sF] = 0
            }
        }
        changeTextView()
    }

    fun segGClick(view: View) {
        when (bitArray[sG]) {
            0 -> {
                segG.setImageResource(R.drawable.ic_segonh)
                bitArray[sG] = 1
            }
            1 -> {
                segG.setImageResource(R.drawable.ic_segoffh)
                bitArray[sG] = 0
            }
        }
        changeTextView()
    }


}
