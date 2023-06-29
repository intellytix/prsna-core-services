package com.intellytix.prsna.core.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "event",schema = "prsna")
public class Event implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="event_id")
    private Long id;

    @Column(name ="event_name")
    private String eventName;

    @Column(name ="type")
    private String type;

    @Column(name ="schedule_id")
    private Long scheduleId;

    @Column(name ="registration_required")
    private Boolean registrationRequired;

    @Column(name ="paid")
    private Boolean paid;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", type='" + type + '\'' +
                ", scheduleId=" + scheduleId +
                ", registrationRequired=" + registrationRequired +
                ", paid=" + paid +
                '}';
    }
}
