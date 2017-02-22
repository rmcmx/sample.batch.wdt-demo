# sample.batch.wdt-demo

This sample makes use of the ***batch-1.0*** and ***batchManagement-1.0*** features of WebSphere Liberty. It is to be used when following the demo [Writing a Java batch application on Liberty](https://www.youtube.com/watch?v=C3AnK8JRR_U)

The demo walks through the minimal steps and configuration required to create and run a batch job with a Chunk step. A Chunk step includes mandatory Reader and Writer artifacts, and the example adds the optional Processor artifact.

**IMPORTANT:** For following the steps on the demo, you need to have Eclipse with WebSphere Application Server Developer Tools, and WebSphere Liberty installed, for installing them go [here](https://developer.ibm.com/wasdev/getstarted/).


## Steps to set up and use this sample app

**1.) Follow the steps on the [Writing a Java batch application on Liberty](https://www.youtube.com/watch?v=C3AnK8JRR_U) demo**

You can configure your Liberty server by following the steps on the demo or by copying and pasting the configuration below into the server.xml file:

```xml
<server description="batch server">
    <featureManager>
		<feature>batchManagement-1.0</feature>
    </featureManager>
    <httpEndpoint httpPort="9080" httpsPort="9443" id="defaultHttpEndpoint"/>
    <keyStore password="{xor}EzY9Oi0rJg=="/>
    <basicRegistry>
    	<user name="user" password="pass"/>
    </basicRegistry>
</server>
```

## Notice

© Copyright IBM Corporation 2017.

## License

```text
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
````
