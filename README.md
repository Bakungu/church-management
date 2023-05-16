Project : SDA church membership

1. Project Requirements

Functional requirements
=======================

1. Member registration:
- A member should be able to create an account on the system with their personal details (name, address, date of birth, contact details, gender, and marital status).
- A member should be able to register for baptism and submit the necessary details, such as the date and location of the baptism, and the name of the pastor who performed the baptism.

2. Transfer request:
- A member should be able to submit a transfer request online and indicate the local church they would like to transfer to.
- The system should generate a unique transfer request number for each transfer request.
- The system should allow church administrators to approve or reject transfer requests.

3. Membership proof:
- A member should be able to view and download a membership certificate or letter from the system at any time.

4. Access control:
- The system should implement user authentication and authorization, with different user roles (member, church administrator, and system administrator).
- Members should be able to access their own information and submit transfer requests, while church administrators should be able to manage member information, approve transfer requests, and generate reports.
- System administrators should be able to manage user accounts, backup and restore the database, and perform other administrative tasks.

5. Reporting:
- The system should provide reports on member registration, transfer requests, and other key metrics.
- Reports should be filterable and sortable by various criteria, such as location, age, gender, and more.


non-functional requirements SDA church member registration system:

1. Security: The system should be secure to protect member information from unauthorized access, data breaches, or cyber attacks. You should consider using 
   encryption, access controls, and other security measures to protect sensitive information.

2. Usability: The system should be easy to use and navigate, with clear and intuitive interfaces. This will help members and administrators interact with 
   the system more effectively and efficiently.

3. Performance: The system should perform well and respond quickly to user requests, even during peak usage times. This will help ensure that members can 
   register and request transfers in a timely manner, without experiencing delays or downtime.

4. Scalability: The system should be scalable to accommodate the growing number of members and churches over time. This may require implementing 
   a distributed system architecture or using cloud-based infrastructure to support high levels of traffic.

5. Reliability: The system should be reliable and available, with minimal downtime or system failures. This will help ensure that members and 
   administrators can access the system whenever they need it.

6. Accessibility: The system should be accessible to all members, regardless of their abilities or disabilities. This may require implementing features 
   such as screen readers, color contrast options, and keyboard navigation to accommodate members with different needs.


=====================================================================================================================================
Database Schema
---------------

Table: Member

  memberId
  firstName
  lastName
  address
  dateOfBirth
  contactDetails
  gender
  maritalStatus
  baptismDate
  baptismLocation
  pastorName
  PRIMARY KEY (`memberId`));


Table: Church

church_id (Primary Key)
name
address
phone_number


Table: Membership

membership_id (Primary Key)
member_id (Foreign Key referencing Member table)
church_id (Foreign Key referencing Church table)
date_joined
date_left (nullable)
is_active



Class Diagram
-------------

     +------------------+          +-----------------+
     |     Member       |          |     Church      |
     +------------------+          +-----------------+
     | - memberId       |          | - church_id     |
     | - firstName      |          | - name          |
     | - lastName       |          | - address       |
     | - address        |          | - phone_number  |
     | - dateOfBirth    |          +-----------------+
     | - contactDetails |
     | - gender         |
     | - maritalStatus  |
     | - baptismDate    |
     | - baptismLocation|
     | - pastorName     |
     +------------------+
              ^
              |
              |
              |
              |
   +---------------------+
   |      Membership     |
   +---------------------+
   | - membership_id     |
   | - date_joined       |
   | - date_left         |
   | - is_active         |
   +---------------------+

=========================================================================================================================================================

User documentation for the SDA Church membership application:
-----------------------------------------------------------

SDA Church Membership Application User Documentation

1. Introduction
The SDA Church Membership Application is designed to manage the membership records of the Seventh-day Adventist (SDA) Church. 
This user guide provides instructions on how to use the application effectively, including login credentials, navigation, and available features.

2. Login Credentials
To access the SDA Church Membership Application, you will need valid login credentials provided by your administrator. 
Please contact your administrator to obtain your username and password.

3. Application Navigation
Upon successful login, you will be presented with the main dashboard of the application. The dashboard provides an overview of key information and 
access to various features. The following sections explain the main navigation elements:

-Menu Bar: The top section of the application contains a menu bar with various options. You can use the menu options to navigate to different sections
 of the application, such as Members, Churches, or Reports.

-Sidebar: The sidebar located on the left side of the application provides quick access to different modules and features. You can expand or collapse 
 the sidebar as needed.

- Search: The search functionality allows you to search for specific members or churches. Simply enter the relevant keywords or criteria in the search 
  box and click the search button.

4. Managing Members
The SDA Church Membership Application provides functionality to manage member records. Here's how you can perform common tasks related to members:

- View Members:Click on the "Members" option in the menu bar to access the member management section. You can view a list of all members, 
   search for specific members, and view individual member details.

- Add New Member: To add a new member, click on the "Add Member" button and fill in the required information, such as first name, last name, 
    date of birth, gender, address, phone number, and email.

- Edit Member Details:To edit member details, navigate to the member's profile and click on the "Edit" button. Update the necessary information 
   and save the changes.

- Manage Memberships: Within the member profile, you can manage the member's church memberships, including joining or leaving dates and 
   active/inactive status.

5. Managing Churches
The SDA Church Membership Application allows you to manage church records. Follow these steps to perform common tasks related to churches:

- View Churches: Click on the "Churches" option in the menu bar to access the church management section. You can view a list of all churches, 
   search for specific churches, and view individual church details.

- Add New Church: To add a new church, click on the "Add Church" button and provide the necessary details, such as church name, address, 
    and phone number.

- Edit Church Details: Navigate to the church's profile and click on the "Edit" button to update the church details.

6. Generating Reports
The SDA Church Membership Application offers reporting capabilities to generate various membership-related reports. 
Here's how you can generate reports:

- Access Reports: Click on the "Reports" option in the menu bar to access the reporting section. You will find a list of available reports.

- Select Report Criteria: Choose the desired report and provide any required criteria, such as date range or membership status.

- Generate Report: Click on the "Generate" button to generate the report. The report will be displayed on the screen or available 
   for download, depending on the report format.

7. Logging Out
To log out of the application, click on your username located in the top-right corner of the screen and select the "Logout" option.

Note: Please remember to keep your login credentials secure and do not share them.


==============================================================================================================================================


SDA Church Membership Application Technical Documentation
---------------------------------------------------------

1. Architecture Overview
The SDA Church Membership Application is a web-based application developed using a three-tier architecture. 
It consists of the following layers:

- Presentation Layer:This layer handles the user interface and interaction with the application. It is responsible for rendering the web pages 
  and handling user input. The front-end utilizes HTML, CSS, and JavaScript for the user interface.

- Application Layer:The application layer contains the business logic and acts as an intermediary between the presentation layer and the 
   data layer. It processes user requests, performs necessary computations, and interacts with the database layer.

- Data Layer: The data layer is responsible for storing and retrieving data from the database. It includes a relational database management 
   system (RDBMS) where the member, church, and membership records are stored.

2. Technology Stack
The SDA Church Membership Application has been implemented using the following technologies and frameworks:

- Programming Languages: The application is primarily developed using Java for the back-end logic and JavaScript for front-end interactivity.

- Web Framework:A web framework such as Spring MVC or JavaServer Faces (JSF) is utilized for handling web requests, managing controllers, 
   and facilitating the Model-View-Controller (MVC) pattern.

- Database Management System: A relational database management system (RDBMS) like MySQL, PostgreSQL, or Oracle is used to store and manage 
   the application's data.

- ORM Framework: An Object-Relational Mapping (ORM) framework, such as Hibernate or JPA (Java Persistence API), is employed to simplify 
   database interactions and provide object-oriented access to the database entities.

- Web Technologies:HTML, CSS, and JavaScript are used for the user interface development, including the layout, styling, and client-side interactions.

- Version Control: A version control system like Git is employed for source code management and collaboration among developers.

3. Application Components
The SDA Church Membership Application consists of various components, including:

- Member Management: This component handles the management of member records, including creating new members, editing member details, 
  and managing their church memberships.

- Church Management: This component deals with the management of church records, enabling the addition of new churches, editing church details, 
  and tracking relevant information.

- Membership Management:This component facilitates the management of memberships, including tracking the joining and leaving dates of members, 
  their active/inactive status, and their associated churches.

- Reporting: This component allows users to generate reports based on various criteria, such as membership status, date range, or specific 
  member/church details.

4. Deployment
The SDA Church Membership Application can be deployed in a web server environment. The specific steps for deployment depend on the chosen 
server and technology stack. Typically, the application is packaged into a WAR (Web ARchive) file and deployed on a web server such as Apache 
Tomcat or Jetty.

5. Integration and APIs
The SDA Church Membership Application may integrate with other systems or APIs as per project requirements. This could include integration 
with authentication systems, email services, or third-party APIs for additional functionality.

6. Security Considerations
To ensure the security of the application and its data, it is important to implement appropriate security measures, such as secure authentication 
and authorization mechanisms, input validation, and protection against common web vulnerabilities like Cross-Site Scripting (XSS) and SQL Injection.

7. Future Enhancements
Based on the project's requirements and future plans, potential enhancements to the application could include features like event management, 
financial contributions tracking, advanced reporting options, and integration with communication platforms for member engagement.









