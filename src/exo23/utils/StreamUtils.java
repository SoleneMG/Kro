package exo23.utils;

import java.io.Closeable;
import java.io.Flushable;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class StreamUtils {

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception exception) {
                LOGGER.log(Level.INFO, "Exception soulevée lors de la fermeture du flux"+exception);
            }
        }
    }

    public static void flush(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception exception) {
                LOGGER.log(Level.INFO, "Exception soulevée lors de la fermeture du flux"+exception);
            }
        }
    }
}
