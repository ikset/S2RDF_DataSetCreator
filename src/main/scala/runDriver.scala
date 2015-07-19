/* Copyright Simon Skilevic
 * Master Thesis for Chair of Databases and Information Systems
 * Uni Freiburg
 */

import dataCreator.DataSetGenerator

object runDriver {
  def main(args:Array[String]){        
    DataSetGenerator.generateDataSet();
  }
}