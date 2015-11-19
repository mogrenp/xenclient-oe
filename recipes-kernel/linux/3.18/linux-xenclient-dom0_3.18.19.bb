DESCRIPTION = "Linux kernel for dom0 in OpenXT"
COMPATIBLE_MACHINE = "(xenclient-dom0)"

PV_MAJOR = "${@"${PV}".split('.', 3)[0]}"
PV_MINOR = "${@"${PV}".split('.', 3)[1]}"

require linux-xenclient-${PV_MAJOR}.${PV_MINOR}.inc

PR = "r2"

