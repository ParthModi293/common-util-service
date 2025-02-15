package org.common.common;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.io.StringWriter;

@Service
@Log4j2
public class LogUtil {


    /**
     * print full exception
     *
     * @param ex
     */
    public static void printErrorStackTraceLog(Exception ex) {
        String sMethodName = ex.getStackTrace()[0].getMethodName();
        String sClassName = ex.getStackTrace()[0].getClassName();
        int lineNumber = ex.getStackTrace()[0].getLineNumber();
        log.error("Exception in " + sClassName + " [" + sMethodName + " - " + lineNumber + "]");
        String sError = getStackTrace(ex);
        log.error(sError);
    }

    /**
     * get stack trace
     *
     * @param throwable
     * @return
     */
    public static String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }
}
