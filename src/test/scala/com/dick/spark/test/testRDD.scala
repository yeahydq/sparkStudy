package com.dick.spark.test

import org.apache.log4j.{Level, Logger}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by dick on 17-6-17.
  */

// $example on:schema_inferring$
// $example off:schema_inferring$
// $example on:init_session$
// $example off:init_session$
// $example on:programmatic_schema$
// $example on:data_types$

case class Person(name: String, age: Long)


// $example on:schema_inferring$
// $example off:schema_inferring$
// $example on:init_session$
// $example off:init_session$
// $example on:programmatic_schema$
// $example on:data_types$


object testRDD {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setAppName("appName").setMaster("local")
    val sc=new SparkContext(conf)

    val field = "Hello"
    def doStuff(rdd: RDD[String]): RDD[String] = { rdd.map(x => field + x) }
//
//    val ppl = sc.textFile("/dick/tool/spark/examples/src/main/resources/people.txt").map(_.split(","))
//        .map(a=>Person(a(0),a(1).trim().toInt)).toDF()
//
//    print(ppl.cache().collect())

  }
}
