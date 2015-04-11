#-------------------------------------------------
#
# Project created by QtCreator 2015-04-11T10:36:04
#
#-------------------------------------------------

QT       -= gui

TARGET = cpp_lib

DEFINES += CPP_LIB_LIBRARY

SOURCES += cpp_lib.cpp

HEADERS += cpp_lib.h\
        cpp_lib_global.h

unix {
    target.path = /usr/lib
    INSTALLS += target
}
