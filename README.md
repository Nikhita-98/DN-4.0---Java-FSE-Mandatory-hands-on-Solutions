<h1 align="center">DN-4.0---JAVA-FSE-MANDATORY-HANDS-ON-SOLUTIONS</h1>
<p align="center"><em>Master Java Skills Through Hands-On Excellence</em></p>

<p align="center">
  <img src="https://img.shields.io/github/last-commit/Nikhita-99/DN-4.0---Java-FSE-Mandatory-hands-on-Solutions" alt="Last Commit"/>
  <img src="https://img.shields.io/badge/java-100%25-yellow"/>
  <img src="https://img.shields.io/github/languages/count/Nikhita-99/DN-4.0---Java-FSE-Mandatory-hands-on-Solutions"/>
</p>

<p align="center">
  Built with the tools and technologies:<br>
  <img src="https://img.shields.io/badge/Maven-Build-blue"/>
  <img src="https://img.shields.io/badge/Spring-Framework-green"/>
  <img src="https://img.shields.io/badge/JUnit-Testing-lightgrey"/>
  <img src="https://img.shields.io/badge/Spring--Security-Secure-brightgreen"/>
  <img src="https://img.shields.io/badge/JWT-Enabled-red"/>
</p>

---

<h2>📌 Table of Contents</h2>

<ul>
  <li><a href="#overview">Overview</a></li>
  <li><a href="#hands-on-modules">Hands-On Modules</a></li>
  <li><a href="#getting-started">Getting Started</a>
    <ul>
      <li><a href="#prerequisites">Prerequisites</a></li>
      <li><a href="#installation">Installation</a></li>
      <li><a href="#usage">Usage</a></li>
      <li><a href="#testing">Testing</a></li>
    </ul>
  </li>
</ul>

---

<h2 id="overview">📖 Overview</h2>

<p><strong>DN-4.0</strong> is a comprehensive developer resource that offers hands-on Java exercises, mini-projects, and real-world architecture examples. It is designed to help developers deepen their understanding of core programming concepts, design patterns, and modern frameworks.</p>

<h3>🚀 Why DN-4.0?</h3>

<ul>
  <li>🏗️ <strong>Modular Architecture</strong>: Demonstrates Spring, Maven, and dependency injection for scalable applications.</li>
  <li>📚 <strong>Core Data Structures & Algorithms</strong>: Provides exercises to strengthen fundamental programming skills.</li>
  <li>✅ <strong>Testing & Logging</strong>: Incorporates JUnit5, Mockito, and SLF4J for reliable, maintainable code.</li>
  <li>🧱 <strong>Design Patterns</strong>: Showcase: Singleton, Factory, and other patterns for robust system design.</li>
  <li>🗃️ <strong>Data Persistence</strong>: Uses JPA/Hibernate with in-memory databases for real-world data management.</li>
  <li>🔐 <strong>Security</strong>: Implements basic JWT authentication with Spring Security.</li>
</ul>

---

<h2 id="hands-on-modules">🛠️ Hands-On Modules</h2>

<h3>🌐 Spring Boot REST Services</h3>
<ul>
  <li><strong>Hello World Controller</strong>: Basic REST API using <code>@Controller</code></li>
  <li><strong>Country Code Lookup</strong>: RESTful API to fetch country by code</li>
</ul>

<h3>🔐 JWT Authentication Service</h3>
<ul>
  <li><strong>Authentication Endpoint:</strong> Exposes <code>/authenticate</code> route</li>
  <li><strong>Generates JWT:</strong> On valid credentials using Spring Security</li>
  <li><strong>Authorization Header:</strong> Uses HTTP Basic Auth with <code>curl -u</code></li>
</ul>

<pre><code>curl -s -u user:pwd http://localhost:8090/authenticate</code></pre>
Expected Output:
<pre><code>{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}</code></pre>

---

<h2 id="getting-started">⚙️ Getting Started</h2>

<h3 id="prerequisites">✅ Prerequisites</h3>
<ul>
  <li><strong>Programming Language:</strong> Java (8+)</li>
  <li><strong>Package Manager:</strong> Maven</li>
</ul>

---

<h3 id="installation">📦 Installation</h3>

<ol>
  <li>Clone the repository:</li>
  <pre><code>git clone https://github.com/Nikhita-99/DN-4.0---Java-FSE-Mandatory-hands-on-Solutions</code></pre>

  <li>Navigate to the project directory:</li>
  <pre><code>cd DN-4.0---Java-FSE-Mandatory-hands-on-Solutions</code></pre>

  <li>Install the dependencies using Maven:</li>
  <pre><code>mvn clean install</code></pre>
</ol>

---

<h3 id="usage">🚀 Usage</h3>

<p>Run any submodule using Spring Boot:</p>
<pre><code>mvn spring-boot:run</code></pre>

---

<h3 id="testing">🧪 Testing</h3>

<p>DN-4.0 uses the <strong>JUnit</strong> test framework. Run the test suite with:</p>
<pre><code>mvn test</code></pre>

---



<p><a href="#table-of-contents">🔙 Back to Top</a></p>
