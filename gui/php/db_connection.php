<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home page</title>
    <link rel="stylesheet" href="../css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../font-awesome/css/all.css">
    <link rel="stylesheet" href="../css/fonts.css">
    <script src="../js/jquery-3.4.1.min.js"></script>
    <script src="../js/bootstrap/bootstrap.js"></script>
    <script src="../js/inclue-footer-navbar.js"></script>
    <script type="text/javascript" src="../js/popper.min.js"></script>
</head>
<body>

<header id="includeNav"></header>

<main class="container-fluid" id="">

    <div class="row">
        <div class="col-lg-2 col-md-12 col-sm-12" style="background-color: #77a2a8">
            <div id="includeSideBar"></div>
        </div>
        <div class="col-lg-10 col-md-12 col-sm-12" style="background-color: lightgoldenrodyellow">

            <div class="container-fluid mt-4 ubnt-mono-regular">
                <h5 class="card-title mon-semibold">Employees</h5>
                <?php

                $conn = oci_connect('Wojtek', 'wojtek_wrona', '//localhost:1521/BazyDanychProjekt');
                if (!$conn) {
                    $e = oci_error();
                    trigger_error(htmlentities($e['message'], ENT_QUOTES), E_USER_ERROR);
                }

                $stid = oci_parse($conn, 'select get_employees as myfunc');

                oci_execute($stid);

                echo "<table border='1'>\n";
                while (($row = oci_fetch_array($stid, OCI_ASSOC))) {
                    echo "<tr>\n";
                    $rc = $row['myfunc'];
                    oci_execute($rc);  // returned column value from the query is a ref cursor
                    while (($rc_row = oci_fetch_array($rc, OCI_ASSOC))) {
                        echo "    <td>" . $rc_row['x'] . "</td>\n";
                    }
                    oci_free_statement($rc);
                    echo "</tr>\n";
                }
                echo "</table>\n";
                ?>

                <table class="table">
                    <tr class="ubnt-mono-bold">
                        <td>#</td>
                        <td>First Name</td>
                        <td>Last Name</td>
                        <td>Date of birth</td>
                        <td>Email</td>
                        <td>Address</td>
                        <td>Phone number</td>
                        <td>Unit</td>
                        <td>Position</td>
                        <td>Salary</td>
                        <td>Account</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>

</main>

<div id="includeFooter"></div>
<script>

    $(function () {
        $("#includeFooter").load("../html/_footer.html");
    });


    $(function () {
        $("#includeNav").load("../html/_navigation.html");
    });

    $(function () {
        $("#includeSideBar").load("../html/_sidebar.html");
    });

</script>
</body>
</html>

