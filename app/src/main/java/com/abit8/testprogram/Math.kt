package com.abit8.testprogram

import androidx.core.text.isDigitsOnly

class Math {

    fun add(a:String, b:String): String{
        var result = ""
        if (a.isInteger() && b.isInteger()){
            result = (a.toInt() + b.toInt()).toString()
        }
        else if (a.contains(".")|| b.contains(".")){
            result = (a.toDouble() + b.toDouble()).toString()
        }
        else{
            result = "Вы обязаны ввести числа"
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""
        if (a.isInteger() && b.isInteger() && b != "0"){
            if (((a.toDouble() / b.toDouble()) % 1).toString() == "0.0"||((a.toDouble() / b.toDouble()) % 1).toString() == "-0.0" ){
                result = (a.toInt() / b.toInt()).toString()
            }else{
                result = (a.toDouble() / b.toDouble()).toString()}
        } else if (a.contains(".") || b.contains(".")) {
            result = "без этого пж"
        } else if (b == "0"){
            result = "на ноль делить нельзя"
        } else {
            result = "пишите только числа"
        }

        return result
    }


    fun String.isInteger() = this.toIntOrNull()?.let { true } ?:false


}