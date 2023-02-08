FILESEXTRAPATHS:prepend:sun50i := "${THISDIR}/files:"

SRC_URI:append:sun50i = " \
    file://0001-Add-ov2640-to-the-dts.patch \
    file://add_ov2640.cfg \
"
