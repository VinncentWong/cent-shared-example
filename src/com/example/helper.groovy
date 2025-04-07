package com.example

public class Helper {

    def steps

    public Helper(steps) {
        this.steps = steps
    }

    void determineOddOrEven(int buildNumber) {
        if (buildNumber % 2 == 0) {
            steps.sh "echo Build Number: ${buildNumber} is even"
        } else {
            steps.sh "echo Build Number: ${buildNumber} is odd"
        }
    }

}
