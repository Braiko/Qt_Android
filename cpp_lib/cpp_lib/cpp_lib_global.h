#ifndef CPP_LIB_GLOBAL_H
#define CPP_LIB_GLOBAL_H

#include <QtCore/qglobal.h>

#if defined(CPP_LIB_LIBRARY)
#  define CPP_LIBSHARED_EXPORT Q_DECL_EXPORT
#else
#  define CPP_LIBSHARED_EXPORT Q_DECL_IMPORT
#endif

#endif // CPP_LIB_GLOBAL_H
