SUMMARY = "Helper packages for the camera project"
LICENSE = "MIT"

IMAGE_FEATURES += "splash"

inherit core-image

PACKAGE_CLASSES ?= "package_ipk"
EXTRA_IMAGE_FEATURES = "debug-tweaks package-management"
IMAGE_INSTALL += "gstreamer1.0 openssh v4l-utils gstreamer1.0-plugins-good gstreamer1.0-plugins-bad opkg gd"
 

                      
