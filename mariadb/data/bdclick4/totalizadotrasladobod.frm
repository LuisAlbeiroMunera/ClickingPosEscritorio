TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`trasladobod`.`cantidad`),\'0\',`bdclick4`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`trasladobod` on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`trasladobod`.`producto`))) group by `bdclick4`.`bdproductos`.`idSistema`
md5=fd4fccf2de1bc6b2c8ef2293842b4b5a
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`trasladobod`.`cantidad`),\'0\',`trasladobod`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `trasladobod` on((`bdproductos`.`idSistema` = `trasladobod`.`producto`))) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`trasladobod`.`cantidad`),\'0\',`bdclick4`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`trasladobod` on((`bdclick4`.`bdproductos`.`idSistema` = `bdclick4`.`trasladobod`.`producto`))) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
