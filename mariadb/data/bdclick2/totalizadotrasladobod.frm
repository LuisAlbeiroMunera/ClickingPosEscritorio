TYPE=VIEW
query=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`trasladobod`.`cantidad`),\'0\',`bdclick2`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`trasladobod` on((`bdclick2`.`bdproductos`.`idSistema` = `bdclick2`.`trasladobod`.`producto`))) group by `bdclick2`.`bdproductos`.`idSistema`
md5=7b7108817d22ea2a42ffb3ca275df7ef
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`trasladobod`.`cantidad`),\'0\',`trasladobod`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `trasladobod` on((`bdproductos`.`idSistema` = `trasladobod`.`producto`))) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`trasladobod`.`cantidad`),\'0\',`bdclick2`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`trasladobod` on((`bdclick2`.`bdproductos`.`idSistema` = `bdclick2`.`trasladobod`.`producto`))) group by `bdclick2`.`bdproductos`.`idSistema`
mariadb-version=100135
