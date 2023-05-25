package org.example;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.Dataset;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        SparkSession sparkSession = SparkSession.builder().appName("demo-app").master("local[*]").getOrCreate();
        Logger.getLogger("org.apache").setLevel(Level.WARN);
        
    }
}
