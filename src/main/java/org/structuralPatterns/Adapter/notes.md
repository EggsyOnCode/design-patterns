# Adapter Pattern

Design Pattern whihc allows multiple incomptible itnerfaces to work with each otebhr; 
it does so via **Composition and inheritance**

serves as teh cable adapter enabling us to use usb-c with usb-b or something;; works like a translator

say our client's UI has undergone some changes and now consumes data in json but the legayc API sends data is XML format; therefore we need a translator to convert XML to JSON 

This transaltor will be used to implemetn the client's UI 

### Principles being followed:
- single resp
- open /closed

