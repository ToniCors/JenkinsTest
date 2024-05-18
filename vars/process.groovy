String varString="Questa è una variabile"

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
    return  "WARNING: ${message}"
}
