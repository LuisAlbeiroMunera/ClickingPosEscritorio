TYPE=VIEW
query=select `bdclick1`.`bdmedicamentosprocesosalertas`.`codigo` AS `codigo`,`bdclick1`.`bdmedicamentosprocesosalertas`.`medicamentos` AS `medicamentos`,`bdclick1`.`bdmedicamentosprocesosalertas`.`posologia` AS `posologia`,`bdclick1`.`bdmedicamentosprocesosalertas`.`idHospitalizacion` AS `idHospitalizacion` from `bdclick1`.`bdmedicamentosprocesosalertas` group by `bdclick1`.`bdmedicamentosprocesosalertas`.`codigo`,`bdclick1`.`bdmedicamentosprocesosalertas`.`medicamentos`,`bdclick1`.`bdmedicamentosprocesosalertas`.`posologia`,`bdclick1`.`bdmedicamentosprocesosalertas`.`idHospitalizacion`
md5=d6d6a28a870a025eea4456789c8af190
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=select `bdmedicamentosprocesosalertas`.`codigo` AS `codigo`,`bdmedicamentosprocesosalertas`.`medicamentos` AS `medicamentos`,`bdmedicamentosprocesosalertas`.`posologia` AS `posologia`,`bdmedicamentosprocesosalertas`.`idHospitalizacion` AS `idHospitalizacion` from `bdmedicamentosprocesosalertas` group by `bdmedicamentosprocesosalertas`.`codigo`,`bdmedicamentosprocesosalertas`.`medicamentos`,`bdmedicamentosprocesosalertas`.`posologia`,`bdmedicamentosprocesosalertas`.`idHospitalizacion`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdmedicamentosprocesosalertas`.`codigo` AS `codigo`,`bdclick1`.`bdmedicamentosprocesosalertas`.`medicamentos` AS `medicamentos`,`bdclick1`.`bdmedicamentosprocesosalertas`.`posologia` AS `posologia`,`bdclick1`.`bdmedicamentosprocesosalertas`.`idHospitalizacion` AS `idHospitalizacion` from `bdclick1`.`bdmedicamentosprocesosalertas` group by `bdclick1`.`bdmedicamentosprocesosalertas`.`codigo`,`bdclick1`.`bdmedicamentosprocesosalertas`.`medicamentos`,`bdclick1`.`bdmedicamentosprocesosalertas`.`posologia`,`bdclick1`.`bdmedicamentosprocesosalertas`.`idHospitalizacion`
mariadb-version=100135