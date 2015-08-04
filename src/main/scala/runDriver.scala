/* Copyright Simon Skilevic
 * Master Thesis for Chair of Databases and Information Systems
 * Uni Freiburg
 */

import dataCreator.DataSetGenerator
import dataCreator.Settings

object runDriver {
  def main(args:Array[String]){
    // parse Args
    Settings.workingDir = args(0)
    Settings.inputRDFSet = args(0) + args(1)
    val datasetType = args(2)
    Settings.ScaleUB = args(3).toFloat
    DataSetGenerator.generateDataSet(datasetType);
  }
}