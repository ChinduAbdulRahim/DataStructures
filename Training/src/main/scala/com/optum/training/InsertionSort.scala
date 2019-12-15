package com.optum.training

object InsertionSort {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    val arr = Array(24, 21, 25, 4, 60)

    // to traverse the array from left to right with incrementing i value for each run
    for (i <- 1 until arr.length) {
      val arrayvalue = arr(i) //arr(1)->21, arr(2)->25
      var ivalue = i //1 //2
      // keep moving the ivalue to next smaller index until A[ivalue - 1] is arrayvalue
      while (ivalue > 0 && arr(ivalue - 1) > arrayvalue) {
        // 1>0 && 24>21
        //2>0 &&
        arr(ivalue) = arr(ivalue - 1) //a(0)=21
        ivalue = ivalue - 1 //0
      }

      arr(ivalue) = arrayvalue //a(0)=21
    }
    print(arr.toSeq)
  }
}