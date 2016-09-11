# SmartController

##Overview
An android application that controls the lights of the home.

Part of my final year project on home automation. 
The objective of this project is to develop a home automation system in IoT using an android application. 
Home automation is automation of the home or household activity. Home automation may include control of lighting, 
to provide more convenience, comfort, power saving and security. Home automation in IoT gives you access to 
control devices in your home over the internet using an android application from anywhere in the world.

In the age of the smartphone, all the services are being moved to mobile applications. With android running 
on 60% of all phones at this time, it is the most popular mobile operating system. In this project we develop 
a native android application to control lights, fans, garage doors and many other devices.

In the client side, the android application has buttons to turn the lights ON/OFF. Upon clicking a button on 
the android application to turn ON/OFF a particular device, it sends a HTTP REST API request to the server. 
The request is sent to through the domain of the router that the raspberry pi 2 model B is connected.

In the server side, the server called webiopi is running on the raspberry pi 2 model B, the server runs on 
the physical port 8000 on the local network. The server has an inbuilt HTTP REST API. The router is constantly
updating its IP address to a dynamic domain name service called no-ip. The service will provide a domain name
to point to the router over the internet. When the application makes the HTTP POST request to the server, 
the server makes the corresponding GPIO pin of the raspberry pi HIGH/LOW. This acts as a control pulse for 
the relay which turns the relay ON/OFF. The hardware is interfaced with the relay and it acts as a switch. 
When the switch is turned ON the circuit is closed and the corresponding device will turn ON.

##License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
####Copyright 2016 Nikhil Bhaskar

