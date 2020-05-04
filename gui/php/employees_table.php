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
                    <?php
                    $stid = oci_parse($conn, 'SELECT * FROM employees');
                    oci_execute($stid);

                    while ($row = oci_fetch_array($stid, OCI_ASSOC+OCI_RETURN_NULLS)) {
                        echo "<tr>\n";
                        foreach ($row as $item) {
                            echo "    <td>" . ($item !== null ? htmlentities($item, ENT_QUOTES) : "&nbsp;") . "</td>\n";
                        }
                        echo "</tr>\n";
                    }
                    ?>
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

