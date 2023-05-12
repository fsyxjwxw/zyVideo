package com.zy.video.utils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * @author Ryan
 * @date 2023/5/11 11:23
 * @description
 */
public class IoUtils {

    public static void outputFile(HttpServletResponse response, byte[] bytes) {
        ServletOutputStream out = null;
        InputStream in = null;
        try {
            out = response.getOutputStream();
            in = new ByteArrayInputStream(bytes);
            byte[] buf = new byte[2048];
            int length;
            while ((length = in.read(buf)) != -1) {
                out.write(buf, 0, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (Objects.nonNull(out)) {
                    out.flush();
                    out.close();
                }
                if (Objects.nonNull(in)) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
