import com.example.Helper

def determineBuildNumber(steps, int buildNumber) {
    def helper = new Helper(steps)
    helper.determineOddOrEven(buildNumber)
}