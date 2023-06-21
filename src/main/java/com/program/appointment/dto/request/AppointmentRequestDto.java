package com.program.appointment.dto.request;

import com.program.appointment.entity.Appointment;
import lombok.Data;

import java.util.Date;

@Data
public class AppointmentRequestDto {
    private Integer id;
    private String name;
    private String email;
    private Date date;
    private String time;

    public AppointmentRequestDto(Appointment app){
        this.id=app.getId();
        this.name= app.getName();
        this.email=app.getEmail();
        this.date=app.getDate();
        this.time=app.getTime();
    }
}
