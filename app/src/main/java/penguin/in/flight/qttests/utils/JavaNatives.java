package penguin.in.flight.qttests.utils;

import android.content.Context;
import android.util.Log;

import penguin.in.flight.qttests.R;

/**
 * Created on 11.04.15.
 */
public class JavaNatives {
    public native static String sayHello();

    public static void init(Context context) {
        load(context, R.array.bundled_in_assets);
        load(context, R.array.qt_libs);
        System.loadLibrary("cpp_lib");
    }

    static void load(Context context, int arrayResourceId) {
        String[] libsToLoad = context.getResources().getStringArray(arrayResourceId);
        for (String lib : libsToLoad) {
            if (lib.indexOf('/') > -1) {
                lib = lib.substring(lib.indexOf('/'));
            }
            if (lib.indexOf("lib") == 0) {
                lib = lib.substring(3);
            }
            if (lib.endsWith(".so")) {
                lib = lib.substring(0, lib.length() - 3);
            }
            Log.i(JavaNatives.class.getSimpleName(), "loading " + lib);
            try {
                System.loadLibrary(lib);
            } catch (Throwable e) {
                Log.i(JavaNatives.class.getSimpleName(), "failed to load " + lib + " " + e);
                e.printStackTrace();
            }
            Log.i(JavaNatives.class.getSimpleName(), "Successfully loaded " + lib);
        }
    }

}