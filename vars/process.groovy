def info(message) {
    echo "INFO: ${message}"
}

def info() {
    echo "INFO: TEST NO PARAMETER"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def warningReturn(message) {
    return "WARNING: ${message}"
}

def warningReturnMap(message) {
    def map = [name: "Jerry", age: 42, city: "New York"]
    return map
}
