package com.streaming
import org.apache.spark._
import org.apache.spark.streaming._
import org.apache.spark.streaming.StreamingContext._
/**
  * Created by Administrator on 2017/12/27.
  */
object DataStreaming {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[2]").setAppName("NetworkWordCount")
    val ssc = new StreamingContext(conf, Seconds(1))

    ssc.start()             // Start the computation
    ssc.awaitTermination()
  }
}
