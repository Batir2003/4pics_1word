package com.example.a4pics1word

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.example.a4pics1word.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionBinding
    private var currentIndexes = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Constants.getQuestions()
        setQuestions()

    }

    fun setQuestions(){
        val questions = Constants.getQuestions()[currentIndexes]
        binding.imageFirst.setImageResource(questions.images[0])
        binding.imageSecond.setImageResource(questions.images[1])
        binding.imageThird.setImageResource(questions.images[2])
        binding.imageFourth.setImageResource(questions.images[3])



    }
    private fun animationScaleUpImagesView(id:Int){
        val currentQuestion = Constants.getQuestions()[currentIndexes]
        when(id){
            1->{
                binding.bigimage.setImageResource(currentQuestion.images[0])
                binding.bigimage.visibility = View.VISIBLE
                binding.bigimage.startAnimation(
                    AnimationUtils.loadAnimation(
                        this,R.anim.scale_up
                    )
                )
            }
            2->{
                binding.bigimage.setImageResource(currentQuestion.images[1])
                binding.bigimage.visibility = View.VISIBLE
                binding.bigimage.startAnimation(
                    AnimationUtils.loadAnimation(
                        this,R.anim.scale_up
                    )
                )
            }
            3->{
                binding.bigimage.setImageResource(currentQuestion.images[2])
                binding.bigimage.visibility = View.VISIBLE
                binding.bigimage.startAnimation(
                    AnimationUtils.loadAnimation(
                        this,R.anim.scale_up
                    )
                )
            }
            4->{
                binding.bigimage.setImageResource(currentQuestion.images[3])
                binding.bigimage.visibility = View.VISIBLE
                binding.bigimage.startAnimation(
                    AnimationUtils.loadAnimation(
                        this,R.anim.scale_up
                    )
                )
            }

        }
    }
}