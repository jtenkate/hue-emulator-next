package com.hueemulator.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class PHScenesEntry
{
    
 @JsonProperty("name")
 private String   name;
 
 @JsonProperty("lights")
 private List<String> lights;
 
 @JsonProperty("active")
 private boolean active;

 @JsonProperty("recycle")
 private boolean recycle;

 @JsonProperty("type")
 private String type;

 @JsonProperty("action")
 private PHLightState   lightState;

 @JsonProperty("lightsIds")
 private List<String>    lightIdentifiers;

 public String getName()
 {
  return name;
 }

 public void setName(String name)
 {
  this.name = name;
 }

 public List<String> getLights()
 {
  return lights;
 }

 public void setLights(List<String> lights)
 {
  this.lights = lights;
 }

 public boolean isActive() {
     return active;
 }

 public void setActive(boolean active) {
     this.active = active;
 }

 public PHLightState getLightState()
 {
  return lightState;
 }

 public void setLightState(PHLightState lightState)
 {
  this.lightState = lightState;
 }

 public List<String> getLightIdentifiers() {
  return lightIdentifiers;
 }

 public void setLightIdentifiers(List<String> lightIdentifiers) {
  this.lightIdentifiers = lightIdentifiers;
 }
}
