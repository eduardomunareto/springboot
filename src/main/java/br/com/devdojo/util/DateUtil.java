package br.com.devdojo.util;



import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Created by eduardomunareto on 14/09/21.
 */
@Component
public class DateUtil
{
    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime)
    {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
