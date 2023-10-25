package com.example.a22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(a: Int, b: Int): Long {
                var answer: Long = 0
                //등차수열의 합 공식을 이용해서 계산시간을줄이자.
                var length : Long = Math.abs((a-b).toLong())+1
                answer = length*(a+b)/2
                return answer
            }

        }
        val a = Solution()
        a.solution(3,5)
        a.solution(3,3)
        a.solution(5,3)
    }
}