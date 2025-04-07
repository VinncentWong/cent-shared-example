package com.example

public class Helper {

    void determineOddOrEven(int buildNumber) {
        if (buildNumber % 2 == 0) {
            sh "echo Build Number: ${buildNumber} is even"
        } else {
            sh "echo Build Number: ${buildNumber} is odd"
        }
    }

}
