<h1>Втора лабораториска вежба по Софтверско инженерство</h1>
<h2>Антонио Трајковски, бр. на индекс 173084</h2>
<h3>Група на код:</h3>
<p>Ја добив групата на код 2</p>
<h3>Control Flow Graph</h3>

![CFG](https://user-images.githubusercontent.com/63405482/84443190-6673be80-ac3f-11ea-88af-e7cde5d14402.png)

<h3>Цикломатска комплексност</h3>
<p>Цикломатската комплексност на овој код е 7, истата ја добив преку бројот на региони во Control Flow Graph.</p>
<h3>Тест случаи според критериумот Every statement</h3>
<table>
<thead>
  <tr>
    <th>Every Statement</th>
    <th>User user1= null , allUsers = anything</th>
    <th>User user2 = new User(null,“Anything”, “antonio_trajkovski12@yahoo.com”),  allUsers=anything</th>
    <th>User user3 = new User(“Antonio” ,“Anything”, null)  allUsers=[James, Dave] </th>
    <th>User user4 = new User(“Antonio” ,“Anything”, “ antonio_trajkovski12@yahoo.com”),  allUsers=[James, Dave]</th>
    <th>User user5 = new User(“Antonio” ,“Anything”, “ antonio_trajkovski12@yahoocom”),  allUsers=[James, Dave]</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>1</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>2</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>3</td>
    <td>*</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>4</td>
    <td></td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>5</td>
    <td></td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>6</td>
    <td></td>
    <td>*</td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>7</td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>8</td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>9</td>
    <td></td>
    <td></td>
    <td>*</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>10</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>11.1</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>11.2</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>11.3</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>12</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>13</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>14</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>15</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>16</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td></td>
  </tr>
  <tr>
    <td>17</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td>*</td>
  </tr>
  <tr>
    <td>18</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
  </tr>
  <tr>
    <td>19</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td></td>
  </tr>
  <tr>
    <td>20</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td></td>
  </tr>
  <tr>
    <td>21</td>
    <td></td>
    <td></td>
    <td></td>
    <td>*</td>
    <td></td>
  </tr>
  <tr>
    <td>22</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
    <td>*</td>
  </tr>
</tbody>
</table>


<h3>Тест случаи според критериумот Every path</h3>
<table>
<thead>
  <tr>
    <th>Path</th>
    <th>Test case</th>
    <th>Output</th>
  
  </tr>
</thead>
<tbody>
  <tr>
    <td>1,2,3,22</td>
    <td>User = null , allUsers = anything</td>
    <td>RuntimeException exception;</td>
  </tr>
  <tr>
    <td>1,2,4,5,6,22</td>
    <td>User user = new User(null,“Anything”, “antonio_trajkovski12@yahoo.com”),  allUsers=anything</td>
    <td>RuntimeException exception;</td>
  </tr>
  <tr>
    <td>1,2,4,5,7,8,9,22</td>
    <td>User user = new User(“Antonio” ,“Anything”, null)  allUsers=[James, Dave] </td>
    <td>false</td>
  </tr>
  <tr>
    <td>1,2,4,5,7,8,10,11.1,11.2,(12,13,14,15,16,11.3,11.2),17,19,
20,21,22
</td>
    <td>User user = new User(“Antonio” ,“Anything”, “ antonio_trajkovski12@yahoo.com”),  allUsers=[James, Dave]</td>
    <td>true</td>
  </tr>
  <tr>
    <td>1,2,4,5,7,8,10,11.1,11.2,(12,13,14,16,11.3,11.2),17,18,22</td>
    <td>User user = new User(“Antonio” ,“Anything”, “ antonio_trajkovski12@yahoocom”),  allUsers=[James, Dave]</td>
    <td>false</td>
  </tr>
  <tr>
    <td>1,2,4,5,7,8,10,11.1,11.2,(12,14,15,16,11.3,11.2),17,18,22</td>
    <td>User user = new User(“Antonio” ,“Anything”, “ antonio_trajkovski12yahoo.com”),  allUsers=[James, Dave]</td>
    <td>false</td>
  </tr>
  <tr>
    <td>1,2,4,5,7,8,10,11.1,11.2,(12,14,16,11.3,11.2),17,18,22</td>
    <td>User user = new User(“Antonio” ,“Anything”, “ antonio_trajkovski12yahoocom”),  allUsers=[James, Dave]</td>
    <td>false</td>
  </tr>
</tbody>
</table>


<h3>Објаснување на напишаните unit tests</h3>
... ...
