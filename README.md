# SmartController

##Overview

The application is used to control devices in the house like lights, fans, garage doors and many more.

The android application has buttons to turn the lights ON/OFF. Upon clicking a button on it sends a HTTP REST API request to the server. The request is sent to through the domain of the router that the raspberry pi 2 model B is connected.

The server called webiopi is running on the raspberry pi 2 model B, the server runs on the physical port 8000 on the local network. The server has an inbuilt HTTP REST API. The router is constantly updating its IP address to a dynamic domain name service called no-ip. The service will provide a domain name to point to the router over the internet. When the application makes the HTTP POST request to the server, the server makes the corresponding GPIO pin of the raspberry pi HIGH/LOW. This acts as a control pulse for 
the relay which turns the relay ON/OFF. The devices are interfaced with the relay and it acts as a switch. When the switch is turned ON the circuit is closed and the corresponding device will turn ON.

##Screenshots
![smart1](https://cloud.githubusercontent.com/assets/19944703/18416727/c486640c-7839-11e6-94b7-ede95bdc6d3c.jpg)

![screenshot_2016-09-11-16-08-32](https://cloud.githubusercontent.com/assets/19944703/18416741/16dcfdd8-783a-11e6-85d5-16f7a0a90d7d.png)





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

