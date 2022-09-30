TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega1` left join `bdclick5`.`oservicio3` on((`bdclick5`.`bdproductosbodega1`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-1\') group by `bdclick5`.`bdproductosbodega1`.`idSistema`
md5=726a6464535cf7bad1ca258ca998829a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:52
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `oservicio3` on((`bdproductosbodega1`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega1` left join `bdclick5`.`oservicio3` on((`bdclick5`.`bdproductosbodega1`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-1\') group by `bdclick5`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
